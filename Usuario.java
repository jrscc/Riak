package bd2.riak.bd2note.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

	private Long codigo;
	private String nome;
	private Date dataNascimento;
	private String login;
	private String senha;
	private String email;
	private List<Lembrete> lembretes = new ArrayList();
	
	public Usuario() {
		
	}
	/**
	 * 
	 * @param nome String - nome
	 * @param dataDeNascimento Date - data de nascimento
	 * @param login String - login
	 * @param senha String - senha
	 * @param email String - email
	 */
	public Usuario(String nome,Date dataDeNascimento, String login, String senha, String email) {
		this.setNome(nome);
		this.setDataNascimento(dataDeNascimento);
		this.setLogin(login);
		this.setSenha(senha);
		this.setEmail(email);
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Lembrete> getLembretes() {
		return lembretes;
	}
	public void setLembretes(List<Lembrete> lembretes) {
		this.lembretes = lembretes;
	}
}
