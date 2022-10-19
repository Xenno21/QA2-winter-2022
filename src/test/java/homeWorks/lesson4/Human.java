package homeWorks.lesson4;

public class Human {
   private  String name;
   private String Gender;
   private Integer age;
   private Float growth;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getGender() {
      return Gender;
   }

   public void setGender(String gender) {
      Gender = gender;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public Float getGrowth() {
      return growth;
   }

   public void setGrowth(Float growth) {
      this.growth = growth;
   }

   public Long getWeightGr() {
      return weightGr;
   }

   public void setWeightGr(Long weightGr) {
      this.weightGr = weightGr;
   }

   private Long weightGr;
}
