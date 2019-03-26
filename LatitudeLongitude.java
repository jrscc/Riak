package bd2.riak.bd2note.modelo;

public class LatitudeLongitude {
	
	private Long codigo;
	private double latitude;
	private double longitude;
	
	public LatitudeLongitude() {
	}
	/**
	 * 
	 * @param latitude double - latitude
	 * @param longitude double - longitude
	 */
	public LatitudeLongitude(double latitude, double longitude) {
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}

	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
