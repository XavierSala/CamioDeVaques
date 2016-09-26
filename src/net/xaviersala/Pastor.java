package net.xaviersala;

import java.util.List;

public class Pastor {

    private String resultat;
    /**
     * Posar les vaques en el camió fins a omplir-lo i etc...
     * @param camio
     * @param vaques
     */
    public void ompleCamio(Camio camio, List<Vaca> vaques) {
          int maximLitres = 0;
          resultat = "";

          for(int i=0; i< vaques.size(); i++) {

              int litres = calculaElNumeroDeLitresAmbAquestesVaques(camio, vaques.subList(i,vaques.size()));
              if (litres > maximLitres) {
                  maximLitres = litres;
                  resultat = camio.toString();
              }
              camio.treureVaques();
          }


    }

    private int calculaElNumeroDeLitresAmbAquestesVaques(Camio camio, List<Vaca> subList) {
        for(Vaca vaca: subList) {
            if (camio.posarVaca(vaca) == false) {
                break;
            }
        }
        return camio.lletVaques();
    }

    public String getResultat() {

        return resultat;
    }




















}
