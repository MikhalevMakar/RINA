package ru.nsu.sber_portal.ccfit.models.dto;

import lombok.*;
import ru.nsu.sber_portal.ccfit.models.dto.orderDto.OrderDto;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckTableDto {
    private Set<OrderDto> listOrderDto = new HashSet<>();
    private Integer numberTable;

    private Long restId;

    private Long cost = 0L;

    public void addOrderDto(OrderDto orderDto) {
        listOrderDto.add(orderDto);
    }
}
