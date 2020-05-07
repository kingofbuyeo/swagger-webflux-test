package me.yongchul.kim.test.server.port.adapter.inbound.rest.data.res.internal;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by kimyc. User: kim-yongchul Date: 2020/05/07 Time: 4:06 오후
 */
@NoArgsConstructor
@Getter
public class InternalTestDTO {
  private String fourth;
  private long fifth;
  private int sixth;

  public InternalTestDTO(String fourth, long fifth, int sixth) {
    this.fourth = fourth;
    this.fifth = fifth;
    this.sixth = sixth;
  }
}
