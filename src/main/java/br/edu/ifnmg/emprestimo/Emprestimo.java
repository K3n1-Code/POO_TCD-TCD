/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.emprestimo;

import br.edu.ifnmg.entity.Entity;
import br.edu.ifnmg.librarian.Librarian;
import br.edu.ifnmg.reader.Reader;
import java.time.LocalDate;

/**
 *
 * @author joaok
 */
public final class Emprestimo extends Entity {

    private LocalDate diaEmprestimo;
    private LocalDate diaRetorno;
    private Librarian librarian;
    private Reader reader;
    
    public Emprestimo() {
    }

    public Emprestimo(Long id, LocalDate diaEmprestimo, LocalDate diaRetorno, Librarian librarian, Reader reader)
    throws Exception {//Cria um empréstimo e logo o registra no banco de dados
        setId(id);
        setDiaEmprestimo(diaEmprestimo);  // Security problem!
        setDiaRetorno(LocalDate.now());  // Security problem!
        setLibrarian(librarian);  // Security problem!
        setReader(reader);
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public void setCopy(Integer book_id){
        //Copy livro = (Colocar a função para achar o copia no CopyDao por id);
        //Preciso também da função do CopyDao por id pra fazer a parte do Box
    }
    
    public LocalDate getDiaEmprestimo() {
        return diaEmprestimo;
    }

    public void setDiaEmprestimo(LocalDate diaEmprestimo) {
        if (diaEmprestimo == null) {
            throw new IllegalArgumentException("Emprestimo: Data de empreestimo nula");
        } else {
            this.diaEmprestimo = diaEmprestimo;
        }
    }

    public LocalDate getDiaRetorno() {
        return diaRetorno;
    }

    public void setDiaRetorno(LocalDate diaRetorno) {
        if (diaRetorno == null) {
            throw new IllegalArgumentException("Emprestimo: Data de Retorno nula");
        } else {
            this.diaRetorno = diaRetorno;
        }
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }


//</editor-fold>
    
        @Override
    public String toString() {
        return "Empreestimo{"
                + "diaEmprestimo=" + this.diaEmprestimo
                + ", diaRetorno=" + this.diaRetorno
                + ", librarian=" + this.librarian
                + ", reader=" + this.reader
                + '}';
    }

}
