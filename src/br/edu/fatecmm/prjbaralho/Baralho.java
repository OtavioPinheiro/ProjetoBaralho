package br.edu.fatecmm.prjbaralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
  private List<Carta> cartas = new ArrayList<Carta>();

  public Baralho() {
    montar();
    embaralhar();
    exibir();
  }

  private void montar() {
    for (Naipe naipe : Naipe.values()) {
      for (Valor valor : Valor.values()) {
        Carta carta = new Carta();
        carta.setNaipe(naipe);
        carta.setValor(valor);
        this.cartas.add(carta);
      }
    }
  }

  private void embaralhar() {
    Collections.shuffle(this.cartas);
  }

  private void exibir() {
    for (Carta carta : this.cartas) {
      System.out.println(carta.toString());
    }
  }
}
