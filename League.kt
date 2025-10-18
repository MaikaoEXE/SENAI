import java.time.LocalDate
import java.time.format.DateTimeFormatter


//Criando Função SEM passagem de parâmentros.
fun exibirTitulo(){

    println("===============================")
    println( "     LEAGUE OF LEGENDS        ")
    println("===============================")
}

//Criando Função Com passagem de parâmentros.

fun calcularPontos(pontosAtual: Int,valor: Int): Int {
    // A função apenas executa o calculo e retorna o resultado.
    val novosPontos = pontosAtual - valor
    return novosPontos
}

// Funções Criadas.

fun main(){
    exibirTitulo()

    println("\n PERFIL ")

    // Variaveis

    val nickname: String = "Mailkao"
    val ranking: String = "Grão-Mestre"
    var Pontos: Int = 895
    val bonecoMain: String = "Yasuo"
    var contaOnline: Boolean = false
    val essenciaAzul: Double = 142582.2678
    val dataCriada: LocalDate = LocalDate.of(2021,5, 25)

    // Exibindo as informações

    println("Nick: $nickname")
    println("Ranking: $ranking")
    println("Pontos Atuais: $Pontos")
    println("Main: $bonecoMain")
    println("Essencia Azul: $essenciaAzul")
    println("Criada: $dataCriada")
    println("Online: $contaOnline")

    // Função COM parâmetro

    println("\n Derrota - Ranked")
    val valorDoPonto = 45

    // A variavel 'pontos' recebe o novo valor.

    Pontos = calcularPontos(Pontos, valorDoPonto)

    println("Você perdeu 45 pontos ")

    // Novos pontos


    println("PDL FINAL: PDL $Pontos")


    // Convertendo Todas as variaveis numericas para texto

    println("======= CONVERTENDO AS VARIAVEIS =======")

    println("Conversão Variavel númerica para Texto")
    val PontosTexto: String = Pontos.toString()
    println(PontosTexto)

    val cemmilcomoString = 100000.toString()
    println(cemmilcomoString)

    //Convertendo a Data para número

    println("Conversão Data para número")
  val datacomoNumero: Int = dataCriada.format(DateTimeFormatter.ofPattern("yyyyMMdd")).toInt()

    println(datacomoNumero)

    // Convertendo Variavel Decimal (Double)

    println("Conversão Doble para String")
    val essenciaFormatado: String = String.format("%.1f", essenciaAzul)
    println(essenciaFormatado)



}