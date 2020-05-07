package me.yongchul.kim.test.server.port.adapter.inbound.rest.internal;

import me.yongchul.kim.test.server.port.adapter.inbound.rest.data.res.internal.InternalTestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by kimyc. User: kim-yongchul Date: 2020/05/07 Time: 4:12 오후
 */
@RestController
@RequestMapping(path = "/test/internal")
public class InternalTestResource {

  @GetMapping
  public Mono<InternalTestDTO> getMappingTest(){
    return Mono.just(new InternalTestDTO());
  }
}
