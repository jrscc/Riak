package bd2.riak.bd2note.modelo;

public class URL extends Anexo {
	
	private int url;
	
	public URL() {
	}
	/**
	 * 
	 * @param descricao String - descricao
	 * @param posicaoLembrete int - posição no lembrete
	 * @param url int - url
	 */
	public URL(String descricao, int posicaoLembrete, int url) {
		this.setDescricao(descricao);
		this.setPosicaoNoLembrete(posicaoLembrete);
		this.setUrl(url);
	}
	
	public int getUrl() {
		return url;
	}
	public void setUrl(int url) {
		this.url = url;
	}
}