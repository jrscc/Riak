package bd2.riak.bd2note.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lembrete {
	
	
	private Long codigo;
	private Date dataCriacao;
	private String titulo;
	private String texto;
	private int posicaoEntreLembretes;
	private List<Anexo> anexo = new ArrayList();
	private List<NotificacaoLembrete> notificacaoLembretes = new ArrayList();
	
	public Lembrete() {
		
	}
	/**
	 * 
	 * @param dataDeCriacao Date - data de criação
	 * @param titulo String - título
	 * @param texto String - texto
	 * @param posicao int - posição entre lembretes
	 */
	public Lembrete(Date dataDeCriacao,String titulo, String texto, int posicao) {
		this.setDataCriacao(dataDeCriacao);
		this.setTitulo(titulo);
		this.setTexto(texto);
		this.setPosicaoEntreLembretes(posicao);
	}

	public List<NotificacaoLembrete> getNotificacaoLembretes() {
		return notificacaoLembretes;
	}
	public List<Anexo> getAnexo() {
		return anexo;
	}
	public void setAnexo(List<Anexo> anexo) {
		this.anexo = anexo;
	}
	public void setNotificacaoLembretes(List<NotificacaoLembrete> notificacaoLembretes) {
		this.notificacaoLembretes = notificacaoLembretes;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getPosicaoEntreLembretes() {
		return posicaoEntreLembretes;
	}
	public void setPosicaoEntreLembretes(int posicaoEntreLembretes) {
		this.posicaoEntreLembretes = posicaoEntreLembretes;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
