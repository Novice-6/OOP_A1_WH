public class GeneralPractitioner extends HealthProfessional {
    // 子类特有实例变量：擅长领域（全科医生通常有多个擅长领域）
    private String[] specializations;
    
    /**
     * 默认构造函数
     * 调用父类默认构造函数，并初始化子类特有变量
     */
    public GeneralPractitioner() {
        super(); // 调用父类默认构造函数
        this.specializations = new String[]{"常见疾病诊疗", "健康体检", "慢性病管理"};
    }
    
    /**
     * 带参构造函数
     * 初始化父类所有变量和子类特有变量
     * @param id 医生ID
     * @param name 医生姓名
     * @param qualificationId 资格证书编号
     * @param specializations 擅长领域数组
     */
    public GeneralPractitioner(String id, String name, String qualificationId, String[] specializations) {
        super(id, name, qualificationId); // 调用父类带参构造函数
        this.specializations = specializations != null ? specializations : new String[]{"未指定擅长领域"};
    }
    
    /**
     * 打印全科医生详细信息
     * 覆盖父类方法，添加子类特有信息
     */
    @Override
    public void printDetails() {
        System.out.println("==================== 全科医生信息 ====================");
        super.printDetails(); // 调用父类方法打印基本信息
        System.out.println("医生类型: 全科医生 (General Practitioner)");
        System.out.print("擅长领域: ");
        for (int i = 0; i < specializations.length; i++) {
            System.out.print(specializations[i]);
            if (i < specializations.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n=====================================================");
    }
    
    // Getter和Setter方法
    public String[] getSpecializations() {
        return specializations;
    }
    
    public void setSpecializations(String[] specializations) {
        this.specializations = specializations != null ? specializations : new String[]{"未指定擅长领域"};
    }
    
    /**
     * 子类特有方法：提供全科咨询服务
     * @param patientName 患者姓名
     */
    public void provideGeneralConsultation(String patientName) {
        System.out.println("全科医生 " + getName() + " 正在为患者 " + patientName + " 提供全科咨询服务");
    }
}
