package com.crud.CrudOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateController {
   static String say="Inserted Name Is %s!";
    Create create=new Create();
    @RequestMapping("create")
        public String insert(@RequestParam String name){

            return create.setName(name);
        }
    @RequestMapping("read")
        public String read(@RequestParam int index){
        return create.display(index);
    }
    @RequestMapping("update")
    public String update(@RequestParam int index,@RequestParam String name){
        return  create.update(index,name);
    }
    @RequestMapping("delete")
    public String delete(@RequestParam int index) {
        return create.delete(index);
    }



}
