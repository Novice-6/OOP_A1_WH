public class HealthProfessional {
    // 必需的实例变量：ID（仅数字）、姓名
    private String id; // 使用String类型以支持前导零，实际项目中可添加数字验证
    private String name;
    
    // 额外相关实例变量：专业资格证书编号（所有健康专业人员均需具备）
    private String qualificationId;
    
    /**
     * 默认构造函数
     * 初始化默认值，避免空指针异常
     */
    public HealthProfessional() {
        this.id = "00000";
        this.name = "Unknown Professional";
        this.qualificationId = "QUAL-0000";
    }
    
    /**
     * 带参构造函数
     * 初始化所有实例变量
     * @param id 健康专业人员ID（仅数字）
     * @param name 健康专业人员姓名
     * @param qualificationId 资格证书编号
     */
    public HealthProfessional(String id, String name, String qualificationId) {
        // 简单验证ID是否为数字（实际项目可增强验证逻辑）
        if (id.matches("\\d+")) {
            this.id = id;
        } else {
            this.id = "00000"; // 非法ID时设置默认值
            System.out.println("警告：ID必须为数字，已设置默认ID: 00000");
        }
        this.name = name;
        this.qualificationId = qualificationId;
    }
    
    /**
     * 打印所有实例变量的方法
     * 展示健康专业人员的基本信息
     */
    public void printDetails() {
        System.out.println("健康专业人员基本信息：");
        System.out.println("ID: " + this.id);
        System.out.println("姓名: " + this.name);
        System.out.println("资格证书编号: " + this.qualificationId);
    }
    
    // Getter和Setter方法（遵循封装原则）
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        if (id.matches("\\d+")) {
            this.id = id;
        } else {
            System.out.println("错误：ID必须为数字，修改失败");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getQualificationId() {
        return qualificationId;
    }
    
    public void setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
    }
}
