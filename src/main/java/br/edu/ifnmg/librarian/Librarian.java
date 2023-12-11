package br.edu.ifnmg.librarian;

import java.time.LocalDate;

import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.role.Role;
import br.edu.ifnmg.user.User;
public class Librarian extends User{

    public Librarian(){
        super();
    }

    public Librarian(String name, String email, LocalDate birthDate, Role role, Credential credential) throws Exception{
        super(name, email, birthDate, role, credential);
    }
    
    
    
}
