Project Introduction
This project is a simple medical appointment system implemented in Java. It is mainly used to manage appointment information between patients and different types of health professionals (such as general practitioners and gastroenterologists), supporting functions like creating appointments, viewing all appointments, and canceling appointments.
Class Structure
The project includes 5 main classes that form the core of the system:
HealthProfessional (Base Class)Represents a general health professional, containing common attributes (ID, name, qualification) and methods (printing details) for all health professionals.
GeneralPractitioner (Subclass)Inherits from HealthProfessional, representing a general practitioner. It additionally includes a "clinic location" attribute and overrides the printDetails() method to display specific information of general practitioners.
Gastroenterologist (Subclass)Inherits from HealthProfessional, representing a gastroenterologist (a specialist in digestive system). It additionally includes a "hospital affiliation" attribute and overrides the printDetails() method to display specific information of specialists.
AppointmentRepresents an appointment between a patient and a health professional, containing attributes such as patient name, mobile phone number, preferred time, and selected doctor. It provides a method to print appointment details.
AssignmentMain (Main Class)The entry class of the system, implementing functions like creating appointments (createAppointment), printing appointments (printExistingAppointments), and canceling appointments (cancelBooking) through static methods. The main method demonstrates the complete usage process of the system.
Main Functions
Create appointments: Record patient information, appointment time, and the attending doctor.
View appointments: Print details of all existing appointments, including patient information and doctor information.
Cancel appointments: Find and cancel the corresponding appointment via the patient's mobile phone number.
Usage
Ensure the Java Development Kit (JDK) is installed.
Place all class files (.java) in the same directory.
Compile all Java files: javac *.java.
Run the main class: java AssignmentMain.
The program will automatically demonstrate the following process:
Create instances of several general practitioners and gastroenterologists.
Print information of all health professionals.
Create 4 appointment instances.
Print all initial appointments.
Cancel the appointment with the specified mobile phone number.
Print the remaining appointments after cancellation.

项目简介
本项目是一个简单的医疗预约系统，使用 Java 语言实现。该系统主要用于管理患者与不同类型健康专业人员（如全科医生、胃肠病学家）的预约信息，支持创建预约、查看所有预约及取消预约等功能。
类结构说明
项目包含以下 5 个主要类，构成了系统的核心功能：
HealthProfessional（基类）表示通用的健康专业人员，包含所有健康专业人员共有的属性（ID、姓名、资格证书）及方法（打印详细信息）。
GeneralPractitioner（子类）继承自HealthProfessional，表示全科医生，额外包含 "诊所位置" 属性，并覆盖printDetails()方法以显示全科医生的特定信息。
Gastroenterologist（子类）继承自HealthProfessional，表示胃肠病学家（消化科专家），额外包含 "所属医院" 属性，并覆盖printDetails()方法以显示专科医生的特定信息。
Appointment表示患者与健康专业人员的预约信息，包含患者姓名、手机号码、预约时间、接诊医生等属性，提供打印预约详情的方法。
AssignmentMain（主类）系统的入口类，通过静态方法实现预约的创建（createAppointment）、打印（printExistingAppointments）、取消（cancelBooking）等功能，并在main方法中演示系统的完整使用流程。
主要功能
创建预约：记录患者信息、预约时间及接诊医生。
查看预约：打印所有当前存在的预约详情，包括患者信息和医生信息。
取消预约：通过患者手机号码查找并取消对应的预约。
使用方法
确保已安装 Java 开发环境（JDK）。
将所有类文件（.java）放在同一目录下。
编译所有 Java 文件：javac *.java。
运行主类：java AssignmentMain。
程序将自动演示以下流程：
创建几位全科医生和胃肠病学家实例。
打印所有健康专业人员的信息。
创建 4 个预约实例。
打印所有初始预约。
取消指定手机号码的预约。
打印取消后的剩余预约。
