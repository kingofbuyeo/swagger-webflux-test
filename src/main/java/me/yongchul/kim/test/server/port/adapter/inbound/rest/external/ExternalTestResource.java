package me.yongchul.kim.test.server.port.adapter.inbound.rest.external;

import me.yongchul.kim.test.server.port.adapter.inbound.rest.data.res.external.ExternalTestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by kimyc. User: kim-yongchul Date: 2020/05/07 Time: 4:07 오후
 */
@RestController
@RequestMapping(path = "/test/external")
public class ExternalTestResource {

  /**
   * 아래와 같이 Return Type을 작성하게 되면 스웨거에서 null 포인트 익셉션을 발생 시키게 된다.
   */
  @GetMapping
  public Mono<ResponseEntity<ExternalTestDTO>> getMappingTest(){
    return Mono.just(ResponseEntity.ok(new ExternalTestDTO()));
  }
}
