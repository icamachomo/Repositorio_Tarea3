public class Persona extends Mamifero{
    private String nombre;
    private String tipoId;
    private int numId;
    private String sexoBiologico;
    private String fechaNacimeinto;

    public Persona(String nombre, String tipoId, int numId) {
        super(nombre);
        this.tipoId = tipoId;
        this.numId = numId;
    }

    public Persona(char sexo){
        if(sexo == 'm' || sexo == 'M'){
            this.sexoBiologico = "Masculino";
        } else if(sexo == 'f' || sexo == 'F'){
            this.sexoBiologico = "Femenino";
        } else {
            this.sexoBiologico = "Sexo definido incorrectamente";
        }
    }

    //Obtener nombre del mes
    private String setMes(int numMes){
        String mes;
        switch(numMes){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Mes sin definir";
        }
        return mes;
    }

    /*/public void setFechaNacimiento(int numDay, int numMonth, int numYear){
       this.fechaNacimeinto = numDay+ " de " + setMes(numMonth), " de " + numYear;
    }/*/

    public String getFechaNacimeinto() {
        return fechaNacimeinto;
    }


    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(char sexo) {
        if(sexo == 'm' || sexo == 'M'){
            this.sexoBiologico = "Masculino";
        } else if(sexo == 'f' || sexo == 'F'){
            this.sexoBiologico = "Femenino";
        } else {
            this.sexoBiologico = "Sexo definido incorrectamente";
        }
    }
}
