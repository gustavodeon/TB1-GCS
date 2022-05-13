public class TestOcorrencias {
    //Classe provisária para registrar ocorrências de palavras proibidas 
public static void main (String[]args){
    Usuario user1 = new Usuario(25,"Pedro", false);
    Usuario user2 = new Usuario(26, "Ricardo", false);
    LogOcorrencias ts = new LogOcorrencias();
    ts.armazena(new Log(user1, "abacaxi", "2022-05-01"));
    ts.armazena(new Log(user2, "laranja", "2022-05-01"));
    ts.armazena(new Log(user1, "melancia", "2022-05-01"));
    ts.armazena(new Log(user2, "morango", "2022-05-01"));
    ts.armazena(new Log(user1, "banana", "2022-05-01"));
    ts.armazena(new Log(user2, "bergamota", "2022-05-01"));
}



}
