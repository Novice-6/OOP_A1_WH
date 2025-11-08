/**
 * 儿科医生类（HealthProfessional的子类）
 * 包含儿科医生特有的属性和行为
 */
public class Pediatrician extends HealthProfessional {
    // 子类特有实例变量：接诊年龄段（儿科医生特有的限制）
    private String ageRange;
    // 子类特有实例变量：是否擅长儿童慢性病治疗
    private boolean specializesInChronicPediatrics;
    
    /**
     * 默认构造函数
     * 调用父类默认构造函数，并初始化子类特有变量
     */
    public Pediatrician() {
        super(); // 调用父类默认构造函数
        this.ageRange = "0-14岁";
        this.specializesInChronicPediatrics = false;
    }
    
    /**
     * 带参构造函数
     * 初始化父类所有变量和子类特有变量
     * @param id 医生ID
     * @param name 医生姓名
     * @param qualificationId 资格证书编号
     * @param ageRange 接诊年龄段
     * @param specializesInChronicPediatrics 是否擅长儿童慢性病治疗
     */
    public Pediatrician(String id, String name, String qualificationId, 
                       String ageRange, boolean specializesInChronicPediatrics) {
        super(id, name, qualificationId); // 调用父类带参构造函数
        this.ageRange = ageRange != null && !ageRange.isEmpty() ? ageRange : "0-14岁";
        this.specializesInChronicPediatrics = specializesInChronicPediatrics;
    }
    
    /**
     * 打印儿科医生详细信息
     * 覆盖父类方法，添加子类特有信息
     */
    @Override
    public void printDetails() {
        System.out.println("==================== 儿科医生信息 ====================");
        super.printDetails(); // 调用父类方法打印基本信息
        System.out.println("医生类型: 儿科医生 (Pediatrician)");
        System.out.println("接诊年龄段: " + this.ageRange);
        System.out.println("擅长儿童慢性病治疗: " + (this.specializesInChronicPediatrics ? "是" : "否"));
        System.out.println("=====================================================");
    }
    
    // Getter和Setter方法
    public String getAgeRange() {
        return ageRange;
    }
    
    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange != null && !ageRange.isEmpty() ? ageRange : "0-14岁";
    }
    
    public boolean isSpecializesInChronicPediatrics() {
        return specializesInChronicPediatrics;
    }
    
    public void setSpecializesInChronicPediatrics(boolean specializesInChronicPediatrics) {
        this.specializesInChronicPediatrics = specializesInChronicPediatrics;
    }
    
    /**
     * 子类特有方法：提供儿童健康评估
     * @param childName 儿童姓名
     * @param childAge 儿童年龄
     */
    public void provideChildHealthAssessment(String childName, int childAge) {
        if (childAge >= 0 && childAge <= 18) {
            System.out.println("儿科医生 " + getName() + " 正在为 " + childAge + "岁儿童 " + childName + " 进行健康评估");
        } else {
            System.out.println("警告：儿科医生仅接诊18岁以下儿童，" + childAge + "岁不在接诊范围内");
        }
    }
}public class Pediatrician {
}

