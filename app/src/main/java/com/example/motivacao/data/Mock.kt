package com.example.motivacao.data

import kotlin.random.Random

class Phrase(val frases: String, var categoryId: Int)

class Mock {

    private val all: Int = 1
    private val emoji: Int = 2
    private val sunny: Int = 3


    private var listaFrases = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", emoji),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", emoji),
        Phrase("Quando está mais escuro, vemos mais estrelas!", emoji),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", emoji),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", emoji),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", emoji),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getFrases(value: Int): String {

        if (value == 1){
            var frasesAll = Random.nextInt(0, listaFrases.size)
            return listaFrases[frasesAll].frases
        }
        else {

            val frasesFiltradas = listaFrases.filter { it.categoryId == value }

            val index = Random.nextInt(0, frasesFiltradas.size)

            return frasesFiltradas[index].frases
        }
    }

}