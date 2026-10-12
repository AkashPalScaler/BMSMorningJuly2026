package com.scaler.bmsmorningjuly2026;

import com.scaler.bmsmorningjuly2026.Models.Region;
import com.scaler.bmsmorningjuly2026.Models.Screen;
import com.scaler.bmsmorningjuly2026.Models.Theatre;
import com.scaler.bmsmorningjuly2026.Repositories.RegionRepository;
import com.scaler.bmsmorningjuly2026.Repositories.ScreenRepository;
import com.scaler.bmsmorningjuly2026.Repositories.TheatreRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BmsMorningJuly2026Application implements CommandLineRunner {

    @Autowired // Springboot will find an object from bean registry(singleton registry) and populate here
    RegionRepository regionRepository;
    @Autowired
    TheatreRepository theatreRepository;
    @Autowired
    ScreenRepository screenRepository;

    public static void main(String[] args) {
        SpringApplication.run(BmsMorningJuly2026Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Region region = new Region();
//        region.setName("Mumbai");
//        regionRepository.save(region);
//
//        Region region2 = new Region();
//        region2.setName("Chennai");
//        regionRepository.save(region2);
//
//        Theatre theatre = new Theatre();
//        theatre.setName("Phoenix");
//        theatre.setRegion(region);
//
//        Theatre theatre2 = new Theatre();
//        theatre2.setName("BKC_INOX");
//        theatre2.setRegion(region);
//
//        Theatre theatre3 = new Theatre();
//        theatre3.setName("POWAI_CINEMAX");
//        theatre3.setRegion(region);
//
//        Theatre theatre4 = new Theatre();
//        theatre4.setName("ANDHERI_PVR");
//        theatre4.setRegion(region2);
//
//        theatreRepository.save(theatre);
//        theatreRepository.save(theatre2);
//        theatreRepository.save(theatre3);
//        theatreRepository.save(theatre4);
//
//
//        Screen screen1A = new Screen();
//        screen1A.setName("1A");
//        screen1A.setTheatre(theatre);
//        screenRepository.save(screen1A);
//        Screen screen2A = new Screen();
//        screen2A.setName("2A");
//        screen2A.setTheatre(theatre);
//        screenRepository.save(screen2A);
//        Screen screen1B = new Screen();
//        screen1B.setName("1B");
//        screen1B.setTheatre(theatre);
//        screenRepository.save(screen1B);
//        Screen screen2B = new Screen();
//        screen2B.setName("2B");
//        screen2B.setTheatre(theatre);
//        screenRepository.save(screen2B);


//        List<Screen> screens = screenRepository.findAll();
//        for (Screen screen : screens) {
//            System.out.println(screen.getName());
//        }
//
//        Screen screen = screenRepository.findById(1L).orElse(null);
//        System.out.println(screen.getName());
//
//        Theatre theatre = theatreRepository.findByName("Phoenix");
//        System.out.println(theatre.getName());
//      Screens -> Theatre -> Name = "Phoenix"
        List<Screen> screenList = screenRepository.findByTheatre_Name("Phoenix");
        for (Screen screen : screenList) {
            System.out.println(screen.getName());
        }
        
        // Movies -> Screen > Theatre -> City -> Name is Mumbai
    }
    // AND (Helps you to add filters of properties on the model), UNDERSCORE(_) - Helps you to add filters of nested properties
}
