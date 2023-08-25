/*
Classe Ingresso: esta classe é responsável por gerenciar os ingressos associados a participantes e eventos.
Atributos:
participante: Um objeto Participante que representa o participante que comprou o ingresso.
evento: Um objeto Evento que indica o evento associado ao ingresso.
dataCompra: Um LocalDateTime que armazena a data e a hora da compra do ingresso.
statusIngresso: Um boolean que indica se o ingresso ainda é válido (true) ou foi cancelado (false).
Métodos:
Ingresso(Participante participante, Evento evento): Construtor que cria um ingresso associado ao participante e evento fornecidos, adiciona o ingresso à lista de ingressos do participante e à lista de inscritos do evento.
setStatusIngresso(boolean status): Define o status do ingresso como true (válido) ou false (cancelado).
getStatusIngresso() :
getEvento() :
setDataCompra(LocalDateTime dataCompra): usado para alterar a data da compra caso necessário
getDataCompra() : usado para pegar a data da compra
getParticipante() : pega o participante associado ao ingresso
 */
