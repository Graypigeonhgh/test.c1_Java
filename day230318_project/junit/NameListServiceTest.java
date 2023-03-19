package junit;

import day230318_project.domain.Employee;
import org.junit.Test;
import day230318_project.service.NameListService;
import day230318_project.service.TeamException;

/**
 * @description:    对NameListService类进行测试
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @version:
 * @date:2023年3月19日12:26:29
 **/
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService service=new NameListService();
        Employee[] employee=service.getAllEmployees();
        for(int i=0;i<employee.length;i++){
            System.out.println(employee[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service=new NameListService();
        int id=101;
        try {
            Employee employee=service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
