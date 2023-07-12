package com.task5.web.controller;
import com.task5.web.service.invitompService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.task5.web.model.invitompmodel;


@RestController
@RequestMapping("/inviti")
public class invitompController {

    @Autowired
    private invitompService InvitompService;

    @GetMapping("/all")
    public List<invitompmodel> getAllInvitomps() {
        return InvitompService.getAllInvitomps();
    }

    @PostMapping("/add")
    public invitompmodel addInvitomp(@RequestBody invitompmodel invitompModel) {
        return InvitompService.addInvitomp(invitompModel);
    }

    @PutMapping("/update")
    public invitompmodel updateInvitomp(@RequestBody invitompmodel invitompModel) {
        return InvitompService.updateInvitomp(invitompModel);
    }

    @DeleteMapping("/delete/{idinvito}")
    public void deleteInvitomp(@PathVariable String idinvito) {
        InvitompService.deleteInvitomp(idinvito);
    }
}
