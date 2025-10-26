void main() {
    IO.println("Olá, esse é o Vizzu!");
    IO.println("Filme: The Godfather");

    int anoDeLancamento = 1972;
    boolean incluidoNoPlano = true;
    double notDoFilme = 9.2;
    String protagonista = "Al Pacino";
    String coadjuvante = "Marlon Brando";
    String tempoDeDuracao = "2 horas e 55 minutos.";
    String sinopse = "Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. " +
            "\nUma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios.";

    IO.println("Ano de lançamento: " + anoDeLancamento);
    IO.println("Elenco: " + protagonista + ", " + coadjuvante);
    IO.println("Tempo de duração: " + tempoDeDuracao);
    IO.println("IMDB = " + notDoFilme);
    IO.println("Sinopse: " + sinopse);
}
