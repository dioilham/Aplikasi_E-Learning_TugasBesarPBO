/*
 * Tugas Besar_Pemrograman Berorientasi Objek_Aplikasi E-Learning
 * Muhammad Maulud H. R.    | 1301154166
 * M. Widadio Ilham         | 1301154360
 * Afra W. D.               | 1301150432
 */
package model;

/**
 *
 * @author M Maulud H R
 */
public class Mahasiswa extends Orang implements Akun {

    private String NIM;
    private String username;
    private String password;

    //Tanpa parameter username & password
//    public Mahasiswa(String nama, String NIM, String tgl_lahir, String tmpt_lahir, String jenis_k) {
//        super.setNama(nama);
//        this.NIM = NIM;
//        super.setTglLahir(tgl_lahir);
//        super.setTmptLahir(tmpt_lahir);
//        super.setGender(jenis_k);
//    }
    
    //Dengan parameter username & password
    public Mahasiswa(String nama, String NIM, String tgl_lahir, String tmpt_lahir, String jenis_k, String username, String password){
        super.setNama(nama);
        this.NIM = NIM;
        super.setTglLahir(tgl_lahir);
        super.setTmptLahir(tmpt_lahir);
        super.setGender(jenis_k);
        this.username = username;
        this.password = password;
    }

    public String getNIM() {
        return NIM;
    }

    @Override
    public String pekerjaan() {
        return "Mahasiswa";
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
