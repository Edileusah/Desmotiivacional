package repository

import infra.MotivationConstants
import java.util.*

data class Phrase(val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHASEFILTER.ALL
    private val MORNING = MotivationConstants.PHASEFILTER.MORNING
    private val HAPPY = MotivationConstants.PHASEFILTER.HAPPY
    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e quebrou a cara.", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando tenta!", HAPPY),
        Phrase("Quando está mais escuro, menos enxergamos!", HAPPY),
        Phrase("Pare quando estiver cansado.", HAPPY),
        Phrase("Não se comprometa!", MORNING),
        Phrase("Se você acredita, não faz  diferença.", MORNING),
        Phrase("Se alguém te ofendeu sem você merecer, volte lá e mereça!", HAPPY),
        Phrase("Você é mais fraco do que pensa.", HAPPY),
        Phrase("Lute como nunca. Perca como sempre.", HAPPY),
        Phrase("Você é muito mais fraco do que pensa.", HAPPY),
        Phrase("Desista porque a luta é grande mas a derrota é certa.", HAPPY),
        Phrase("Quando muita gente diz que não vai dar certo, acredite neles.", HAPPY),
        Phrase("Use suas quedas para aprender a nunca se levantar.", HAPPY),
        Phrase("Esqueça os erros do passado e comece a planejar os erros do futuro", HAPPY),
        Phrase("Nada é tão horrível que não possa piorar muito", HAPPY),
        Phrase("É só uma fase ruim, logo vai piorar.", HAPPY),
        Phrase("Nada como um dia pior que outro", HAPPY),
        Phrase("Nenhum obstáculo é grande para quem desiste.", HAPPY),
        Phrase("Hoje é sempre uma oportunidade de mostrar que você pode ser pior que ontem.", HAPPY),
        Phrase("Nunca deixe ninguém dizer que você não consegue. Diga você EU NÃO CONSIGO!", HAPPY),
        Phrase("Se ontem foi ruim fique tranquilo, hoje será muito pior.", HAPPY),
        Phrase("Seu único limite é você mesmo.", HAPPY),
        Phrase("Seja a protagonista do seu fracasso.", HAPPY),
        Phrase("O não você já tem.Agora falta buscar a humilhação.", HAPPY),
        Phrase("A maior derrota é acreditar que é capaz.", HAPPY),
        Phrase("Não deixe uma vitória te atrapalhar.", HAPPY),
        Phrase("Só dará  errado se você tentar.", HAPPY),
        Phrase("Para de achar que ninguém gosta de você. Comece a ter certeza disso!", HAPPY),
        Phrase("Você nasceu pra sonhar, conquistar já é outra história.", HAPPY),
        Phrase("Vá descançar!", MORNING),
        Phrase("No fim tudo dá certo, se não deu certo é porque tem coisas que não dá mesmo.", MORNING),
        Phrase("A melhor parte do sonho é quando percebemos que é impossível realizá-lo.", MORNING),
        Phrase("Não tente! Nunca vai dar certo mesmo.", MORNING),
        Phrase("Confie em si mesmo assim, sua maior decepção será você mesmo.", MORNING),
        Phrase("O recomeço é uma oportunidade de um novo fracasso.", MORNING),
        Phrase("Procure saber antes se é impossível, porque daí você não precisa nem tentar.", MORNING),
        Phrase("Não deixe que uma frase motivacional melhore o seu dia de merda.", MORNING),
        Phrase("Não espere um motivo para desistir. Seja o motivo!", MORNING),
        Phrase("Ele (a) ainda se lembra de você. Com raiva!", MORNING),
        Phrase("Se você não conseguir de primeira, remova todas as evidências de que você tentou!", MORNING),
        Phrase("Se você vai se atrasar, então se atrase de verdade. Não apenas dois minutinhos. Atrase-se uma hora e aproveite seu café da manhã.", MORNING),
        Phrase("Nem todo mundo será Astronauta quando crescer.", MORNING),
        Phrase("Aproveite os momentos sob os holofotes, pois eles não vão durar muito!", MORNING),
        Phrase("Vai! E se der medo, não vai não, pô. Fica aí…", MORNING),
        Phrase("Procrastinar é acreditar no potencial do seu eu do amanhã.", MORNING),
        Phrase("Não deixe para desistir amanhã do que você pode desistir hoje.", MORNING),
        Phrase("Se a zona de conforto fosse ruim, não se chamaria zona de conforto!", MORNING),
        Phrase("Não desanime com uma derrota. Amanhã tem mais!", MORNING),
        Phrase("Nossa... Você ainda está aí?!", MORNING),

        )

    fun getPhrase(categoryId: Int): String {

        val filtered = mListPhrases.filter { (it.category == categoryId || categoryId == ALL) }
        val rand = Random().nextInt(mListPhrases.size)
        return filtered[rand].description
    }
}