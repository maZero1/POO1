package GptQuestions.Chale;

import java.util.Date;

public class Reserva {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private String status;

    public Reserva(int id, Date dataInicio, Date dataFim, String status){
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public int getId(){
        return this.id;
    }
}
