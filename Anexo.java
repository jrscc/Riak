package bd2.riak.bd2note.modelo;

public abstract class Anexo {
	
	private Long codigo;
	private String descricao;
	private int posicaoNoLembrete;

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPosicaoNoLembrete() {
		return posicaoNoLembrete;
	}
	public void setPosicaoNoLembrete(int posicaoNoLembrete) {
		this.posicaoNoLembrete = posicaoNoLembrete;
	}
}
