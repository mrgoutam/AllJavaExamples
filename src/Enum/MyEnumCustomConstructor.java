/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/*
This example gives you how to create custom constructor for enum.
The constructor should be either private or default scope, should not be protected or public.
All elements defined in the enum must call constructor.
 */
public class MyEnumCustomConstructor {
    enum Department{
         
        ACCOUNT(12),HR(24),FINANCE(100),SECURITY(108);
         
        private int deptId;
         
        Department(int id){
            deptId = id;
        }
         
        public int getDeptId(){
            return deptId;
        }
    }
     
    public static void main(String a[]){
        System.out.println("Accounts dept id:"+Department.ACCOUNT.getDeptId());
        System.out.println("HR dept id:"+Department.HR.getDeptId());
        System.out.println("Security dept id:"+Department.SECURITY.getDeptId());
    }
}
