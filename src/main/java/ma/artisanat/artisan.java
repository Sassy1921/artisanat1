package ma.artisanat;

import java.util.Date;
import java.util.Objects;

public class artisan {
    private int id;
    private String name;
    private Date dateNaissance;
    private String gender;
    private int product_id;
    private String specialty;
    private int tel;
    private String address;

    private int experience;




    public artisan(int id, String name, Date dateNaissance, String gender, int product_id, String specialty, int tel, String address, int experience) {
        this.id = id;
        this.name = name;

        this.dateNaissance = dateNaissance;
        this.gender = gender;
        this.product_id = product_id;
        this.specialty = specialty;
        this.tel = tel;
        this.address = address;
        this.experience = experience;
    }

    public artisan() {

    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    // getters and setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getProduct() {
        return product_id;
    }

    public void setProduct(int product_id) {
        this.product_id = product_id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return "artisan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", gender='" + gender + '\'' +
                ", product_id=" + product_id +
                ", specialty='" + specialty + '\'' +
                ", tel=" + tel +
                ", address='" + address + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        artisan artisan = (artisan) o;
        return id == artisan.id && product_id == artisan.product_id && tel == artisan.tel && experience == artisan.experience && Objects.equals(name, artisan.name) && Objects.equals(dateNaissance, artisan.dateNaissance) && Objects.equals(gender, artisan.gender) && Objects.equals(specialty, artisan.specialty) && Objects.equals(address, artisan.address);
    }


}
