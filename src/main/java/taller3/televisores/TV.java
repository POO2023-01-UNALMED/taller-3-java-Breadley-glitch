package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marc) {
		marca = marc;
	}
	public Control getControl() {
		 return this.control;
	 }
	public void setControl(Control control) {
		 this.control = control;
	 }
	public int getPrecio() {
		 return this.precio;
	 }
	public void setPrecio(int price) {
		 precio = price;
	 }
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int vol) {
		volumen = vol;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int can) {
		if (this.estado && canal >=1 && canal <=120) {
			this.canal = can;
		}
	}
	public static int getNumTV() {
		return numTV;
	}

	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	public int canalUp() {
		if ((estado) && (canal<=120 || canal >=1)) {
				return canal++;
			}
		return canal;
	}
	public int canalDown() {
		if ((estado)&&( canal>=1 || canal <=120)) {
				canal-=1;
			}
		return canal;
	}
	public int volumenUp() {
		if (estado && volumen<7) {
				return volumen ++;
			}
		return volumen;
	}
	
	public int volumenDown() {
		if (estado && volumen >0) {
				return volumen =-1;
			}
		return volumen;
	
	}
	public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }
	}

