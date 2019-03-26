package bd2.riak.bd2note.modelo;

public class Imagem extends Anexo {
	
	private int caminhoSistemaArquivos;

	public Imagem() {	
	}
	/**
	 * 
	 * @param descricao String - descricao
	 * @param posicaoLembrete int - posição no lembrete
	 * @param caminhoSistemaArquivos int - caminho do sistema de arquivo
	 */
	public Imagem(String descricao, int posicaoLembrete, int caminhoSistemaArquivos) {
		this.setDescricao(descricao);
		this.setPosicaoNoLembrete(posicaoLembrete);
		this.setCaminhoSistemaArquivos(caminhoSistemaArquivos);
	}
	
	public int getCaminhoSistemaArquivos() {
		return caminhoSistemaArquivos;
	}
	public void setCaminhoSistemaArquivos(int caminhoSistemaArquivos) {
		this.caminhoSistemaArquivos = caminhoSistemaArquivos;
	}
}
