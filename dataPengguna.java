/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Lenovo V14
 */
public class dataPengguna {
    String username, password, hakakses;
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username = username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public String gethakakses(){
        return hakakses;
    }
    public void sethakakses(String hakakses){
        this.hakakses = hakakses;
    }
    
    int idpengguna;
    public int idpengguna(){
        return idpengguna;
    }
    public void setidpengguna(int idpengguna){
        this.idpengguna = idpengguna;
    }
}
