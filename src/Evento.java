/*
Classe Evento: esta classe é responsável por criar e gerenciar 
os eventos disponíveis.

Atributos:
nomeEvento: uma String que representa o nome do evento.
localEvento: uma String que indica o local onde o evento ocorrerá.
dataEvento: uma LocalDate que armazena a data do evento.
capacidadeEvento: um int que indica a capacidade máxima de pessoas que podem participar do evento.
inscritosEvento: um ArrayList<Ingresso> que guarda os ingressos associados a esse evento.
eventos: um ArrayList<Evento> estático (é o mesmo para todas as intâncias) que guarda todos os eventos criados.

Métodos:
Evento(String nomeEvento, String localEvento, LocalDate dataEvento, int capacidadeEvento): Construtor que inicializa o evento com os valores fornecidos e adiciona o evento à lista estática eventos.
getEventos(): retorna a lista estática de todos os eventos cadastrados
mostraInfoEvento: lista os dados do evento 
getLocalEvento(): retorna o local do evento
setLocalEvento(String localEvento): permite alterar o local do evento
getNomeEvento(): retorna o nome do evento
setNomeEvento(String nomeEvento): permite alterar o nome do evento
getDataEvento(): retorna a data do evento
setDataEvento(LocalDateTime dataEvento): permite alterar a data do envento
getCapacidadeEvento(): retorna a capacidade do evento
setCapacidadeEvento(int capacidadeEvento): permite alterar a capacidade do evento
cancelarEvento(): Cancela o evento, definindo o statusIngresso de todos os ingressos associados a ele como false e remove o evento da lista estática eventos.
incluirInscrito():inclui inscrito na lista inscritosEvento
*/

import java.util.*;
import java.time.LocalDateTime;

public class Evento {
    private String nomeEvento;
    private String localEvento; 
    private LocalDateTime dataEvento; 
    private int capacidadeEvento;
    private List<Ingresso> inscritosEvento;
    private static List<Evento> eventos;
    
    // Método construtor
    public Evento(
                String nomeEvento, 
                String localEvento, 
                LocalDateTime dataEvento, 
                int capacidadeEvento){
    }

    public static List<Evento> getEventos() {
        return null;
    }

    public void mostraInfoEvento(){

    }
    public String getLocalEvento(){
        return null;
    }
    public void setLocalEvento(String localEvento){
        
    }
    public String getNomeEvento(){
        return null;
    }
    public void setNomeEvento(String nomeEvento){
        
    }  
    public LocalDateTime getDataEvento(){
        return null;
    }
    public void setDataEvento(LocalDateTime dataEvento){
        
    }
    public int getCapacidadeEvento(){
        return 0;
    }
    public void setCapacidadeEvento(int capacidadeEvento){
        
    } 
    public void incluiInscritoEvento(Ingresso ingresso){
        
    }
    public void cancelarEvento() {

    }

}
