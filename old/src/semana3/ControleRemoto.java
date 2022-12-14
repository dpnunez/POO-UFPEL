package semana3;


// A ideia na semana 3 é criar um classe TV e usar esse controle remoto somente como interface
public class ControleRemoto {
	private Tv televisao;
	
	public ControleRemoto() {
		this.televisao = null;
	}
	
	public ControleRemoto(Tv tv) {
		this.televisao = tv;
	}
	
	public ControleRemoto(ControleRemoto cp) {
		this.televisao = cp.getTelevisao();
	}
	
	public boolean aumentarVolume() {
		return televisao.aumentarVolume();
	}
	
	public boolean diminuirVolume() {
		return televisao.diminuirVolume();
	}
	
	public boolean proximoCanal() {
		return televisao.aumentarCanal();
	}
	
	public boolean diminuirCanal() {
		return televisao.diminuirCanal();
	}
	
	public boolean trocarCanal(int canal) {
		return televisao.setCanal(canal);
	}
	
	public Tv getTelevisao() {
		return televisao;
	}
	
	public void setTelevisao(Tv televisao) {
		this.televisao = televisao;
	}
}
