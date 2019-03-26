package bd2.riak.bd2note.modelo;

public class Local extends Anexo {
	
	private String cep;
	private String cidade;
	private String estado;
	private String pais;
	private LatitudeLongitude latitudeLongitude;
	
	public Local () {
	}
	/**
	 * 
	 * @param descricao String - descricao
	 * @param posicaoLembrete int - posição no lembrete
	 * @param cep String - CEP
	 * @param cidade String - cidade
	 * @param estado String - estado
	 * @param pais String - pais
	 */
	public Local(String descricao, int posicaoLembrete, String cep, String cidade, String estado, String pais) {
		this.setDescricao(descricao);
		this.setPosicaoNoLembrete(posicaoLembrete);
		this.setCep(cep);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setPais(pais);
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public LatitudeLongitude getLatitudeLongitude() {
		return latitudeLongitude;
	}
	public void setLatitudeLongitude(LatitudeLongitude latitudeLongitude) {
		this.latitudeLongitude = latitudeLongitude;
	}
}
