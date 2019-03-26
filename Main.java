package Principal;

import java.net.UnknownHostException;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.core.RiakCluster;
import com.basho.riak.client.core.RiakNode;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.core.query.RiakObject;

import bd2.riak.bd2note.modelo.Lembrete;
import bd2.riak.bd2note.modelo.Usuario;
import bd2.riak.bd2note.persistencia.UsuarioRiakDAO;

public class Main {
	
	 private static RiakCluster setUpCluster() throws UnknownHostException {
	        // Este exemplo usara somente um no no IP e porta informados
	        RiakNode node = new RiakNode.Builder()
	                .withRemoteAddress("127.0.0.1")
	                .withRemotePort(8087)
	                .build();

	        // Este objeto cluster pega o objeto node como argumento
	        RiakCluster cluster = new RiakCluster.Builder(node)
	                .build();

	        // O cluster deverá estar funcionando, senão voce somente vai ver erros.
	        cluster.start();

	        return cluster;
	    }

	public static void main(String[] args) {
			RiakCluster cluster = null;	
		try {
		
			Lembrete lembrete = new Lembrete();
			lembrete.setTitulo("fazer exercicio");
			lembrete.setTexto("caminhada");
			
			Usuario marcos = new Usuario();
			marcos.setNome("Marcos Fabio");
			marcos.setLogin("Marcosjr");
			marcos.setSenha("123456");
			marcos.setEmail("marcos@academico.ifpb");
			
			marcos.getLembretes().add(lembrete);
			
			RiakObject quoteObject = new RiakObject();

			
			cluster = setUpCluster();
			RiakClient client = new RiakClient(cluster);
//			UsuarioRiakDAO urdao = new UsuarioRiakDAO();
			Namespace usuariosBucket = new Namespace("usuarios");
			Location usuarioLocation = new Location(usuariosBucket, "marcos");
			StoreValue storeUserOp = new StoreValue.Builder(marcos)
                .withLocation(usuarioLocation)
                .build();
			client.execute(storeUserOp);
//			urdao.create(client, marcos, "marcos");
			
			
		
		} catch (Exception e) {
			System.out.println(e.printStackTrace(););
		}finally{
			cluster.shutdown();
		}
		
	}
}
