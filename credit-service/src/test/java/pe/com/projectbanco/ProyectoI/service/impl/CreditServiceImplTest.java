package pe.com.projectbanco.ProyectoI.service.impl;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.projectbanco.ProyectoI.impl.CreditServiceImpl;
import pe.com.projectbanco.ProyectoI.model.Credit;
import pe.com.projectbanco.ProyectoI.repo.ICreditRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
@RequiredArgsConstructor
public class CreditServiceImplTest {
   // private static final Logger logger = LoggerFactory.getLogger(CreditServiceImplTest.class);
    @Mock
    ICreditRepo RepoCredit;

    @InjectMocks
    CreditServiceImpl creditService;

    @Autowired
    private Mono<Credit> creditMono;
    @Autowired
    private Flux<Credit> creditflux;
    @Autowired
    private Credit credit ;

    @BeforeEach
    void ini(){
        creditMono = Mono.just(new Credit("1", "true", "21458963256", 500.00,600));
        creditflux= Flux.just(new Credit("1", "true", "21458963256", 500.00, 600));
        credit =Credit.builder().id("1").status("true").nroAccount("1451258").balance(500.00).limit(600).build(); ;
    }

    @Test
    void creditbyId() {
        Mockito.when(RepoCredit.findById("1")).thenReturn(creditMono);
        Mono<Credit> obj = creditService.listPorId("1");
        assertEquals(creditMono, obj);
        creditMono.subscribe(x -> assertEquals("1", x.getId()));
        creditMono.subscribe(y -> assertEquals("true", y.getStatus()));
    }
}
