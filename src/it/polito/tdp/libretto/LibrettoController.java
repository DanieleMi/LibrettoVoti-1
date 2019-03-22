package it.polito.tdp.libretto;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.libretto.model.Libretto;
import it.polito.tdp.libretto.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LibrettoController {
	
	// the Model
	private Libretto libr ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNomeCorso;

    @FXML
    private ComboBox<Integer> boxPunteggio;

    @FXML
    private DatePicker dataEsame;

    @FXML
    private ListView<Voto> votiList;

    @FXML
    void handleCancella24(ActionEvent event) {

    }

    @FXML
    void handleCercaNome(ActionEvent event) {

    }

    @FXML
    void handleCercaPunteggio(ActionEvent event) {

    }

    @FXML
    void handleInserisci(ActionEvent event) {

    }

    @FXML
    void handleMiglioraLibretto(ActionEvent event) {

    }

    @FXML
    void handleOrdinaEsame(ActionEvent event) {

    }

    @FXML
    void handleOrdinaVoto(ActionEvent event) {

    }

    public void setModel(Libretto libr) {
    	this.libr = libr ;
    	this.votiList.itemsProperty().bind(this.libr.votiProperty());
    	
		libr.add( new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)) );
		libr.add( new Voto(21, "Analisi II", LocalDate.of(2018, 1, 25)) );
		libr.add( new Voto(25, "Fisica I", LocalDate.of(2017, 6, 10)) );
		libr.add( new Voto(28, "Fisica II", LocalDate.of(2018, 9, 3)) );
		libr.add( new Voto(18, "Geometria", LocalDate.of(2017, 9, 1)) );
		libr.add( new Voto(20, "Economia", LocalDate.of(2018, 1, 28)) );
		libr.add( new Voto(25, "Ricerca Operativa", LocalDate.of(2018, 6, 5)) );
		libr.add( new Voto(24, "Complementi di Economia", LocalDate.of(2018, 2, 15)) );
		libr.add( new Voto(25, "Logistica", LocalDate.of(2019, 2, 1)) );
		libr.add( new Voto(27, "Programmazione a Oggeti", LocalDate.of(2019, 1, 25)) );

    }
    
    @FXML
    void initialize() {
        assert txtNomeCorso != null : "fx:id=\"txtNomeCorso\" was not injected: check your FXML file 'LibrettoVoti.fxml'.";
        assert boxPunteggio != null : "fx:id=\"boxPunteggio\" was not injected: check your FXML file 'LibrettoVoti.fxml'.";
        assert dataEsame != null : "fx:id=\"dataEsame\" was not injected: check your FXML file 'LibrettoVoti.fxml'.";
        assert votiList != null : "fx:id=\"votiList\" was not injected: check your FXML file 'LibrettoVoti.fxml'.";

        for (Integer i=18; i<=30; i++)
        	boxPunteggio.getItems().add(i);

    }
}
