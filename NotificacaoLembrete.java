package bd2.riak.bd2note.modelo;

import java.util.Date;

public class NotificacaoLembrete {
	
	private Long codigo;
	private Date dataHoraLembrar;
	private ModoNotificacao modo;
	private boolean confirmado;

	public NotificacaoLembrete() {
	}
	/**
	 * 
	 * @param dataHoraLembrar Date - data com a hora do lembrete de notificação
	 * @param modo ModoNotificação - EMAIL ou TELA
	 * @param confirmacao boolean - confirmação
	 * @param usuario Usuario - usuario cadastrado
	 */
	public NotificacaoLembrete(Date dataHoraLembrar, ModoNotificacao modo,boolean confirmacao) {
		this.setDataHoraLembrar(dataHoraLembrar);
		this.setModo(modo);
		this.setConfirmado(confirmacao);
	}
	/**
	 * 
	 * @param dataHoraLembrar Date - data com a hora do lembrete de notificação
	 * @param modo ModoNotificação - EMAIL ou TELA
	 * @param confirmacao boolean - confirmação
	 * @param usuario Usuario - usuario cadastrado
	 */
	public NotificacaoLembrete(Date dataHoraLembrar, ModoNotificacao modo,boolean confirmacao, Usuario usuario) {
		this.setDataHoraLembrar(dataHoraLembrar);
		this.setModo(modo);
		this.setConfirmado(confirmacao);
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Date getDataHoraLembrar() {
		return dataHoraLembrar;
	}
	public void setDataHoraLembrar(Date dataHoraLembrar) {
		this.dataHoraLembrar = dataHoraLembrar;
	}
	public ModoNotificacao getModo() {
		return modo;
	}
	public void setModo(ModoNotificacao modo) {
		this.modo = modo;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
}
