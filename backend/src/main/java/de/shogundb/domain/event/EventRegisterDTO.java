package de.shogundb.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class EventRegisterDTO {
    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @NotNull
    private LocalDate date;

    @NotNull
    @Builder.Default
    private List<Long> members = new ArrayList<>();
}
