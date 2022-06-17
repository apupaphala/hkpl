package hkpl_backend.hkpl_backend.api;

import hkpl_backend.hkpl_backend.data.Fixture;
import hkpl_backend.hkpl_backend.data.FixtureResult;
import hkpl_backend.hkpl_backend.data.dto.FixtureResponseDto;
import hkpl_backend.hkpl_backend.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class footballApi {
    @Autowired
    private FootballService footballService;

    @GetMapping("/fixtures")
    public Fixture getFixture ()throws Exception{
        Fixture fixtures = footballService.getFixtureWithin();
        System.out.println(fixtures);


        return fixtures;

    }
}
