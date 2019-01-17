package br.com.riachuelo.poc.model;

import br.com.riachuelo.poc.util.JsonDateDeserializer;
import br.com.riachuelo.poc.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Audited
@Entity
@Table
@AuditTable(value = "CLIENTE_AUDIT")
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "DAT_NASC")
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date dataNascimento;

    @Column(name = "TXT_EMAIL")
    private String email;

    @Column(name = "NOM_CLIENTE")
    private String nomeCliente;

    @Column(name = "NUM_CPF")
    private Long numeroCpf;

    @Column(name = "IND_END_CORRESP")
    private String tipoEndereco;

    @Column(name = "dat_atual_email")
    @JsonIgnore
    private Date dataAtualizacaoEmail;

}
