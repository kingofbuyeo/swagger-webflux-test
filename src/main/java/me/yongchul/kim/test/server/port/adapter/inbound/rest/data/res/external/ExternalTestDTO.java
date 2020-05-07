package me.yongchul.kim.test.server.port.adapter.inbound.rest.data.res.external;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by kimyc. User: kim-yongchul Date: 2020/05/07 Time: 4:05 오후
 */
@NoArgsConstructor
@Getter
public class ExternalTestDTO {
  private int first;
  private int second;
  private String third;

  public ExternalTestDTO(int first, int second, String third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }
}
