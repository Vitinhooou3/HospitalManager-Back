package com.funtec.systemhospital.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeitoForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max = 100, message = "'${validatedValues}' precisa estar entre 3 e " +
            "100 caracteres")
    private String nome;
}
