package br.com.riachuelo.poc.model;

import br.com.riachuelo.poc.util.JsonDateDeserializer;
import br.com.riachuelo.poc.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Audited
@Entity
@Table(name = "C_INFO_CADASTRO")
@AuditTable(value = "C_INFO_CADASTRO_AUDIT")
@ApiModel(value = "Cliente", description = "Entidade que representa um cliente do Grupo Guararapes")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @ApiModelProperty(dataType = "Long",
            name = "clienteId", required = true, value = "clienteId")
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "DAT_NASC")
    @ApiModelProperty(name = "dataNascimento", required = true, value = "Data de nascimento")
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date dataNascimento;

    @Column(name = "TXT_EMAIL")
    @ApiModelProperty(dataType = "String", name = "email", required = true,
            value = "Email do cliente")
    private String email;

    @Column(name = "NOM_CLIENTE")
    @ApiModelProperty(dataType = "String", name = "nomeCliente", required = true,
            value = "Nome do cliente")
    private String nomeCliente;

    @Column(name = "NUM_CPF")
    @ApiModelProperty(dataType = "Long", name = "numeroCpf", required = true,
            value = "CPF do cliente")
    private Long numeroCpf;

    @Column(name = "IND_END_CORRESP")
    @ApiModelProperty(dataType = "String", name = "tipoEndereco", required = true,
            value = "Endereço do cliente")
    private String tipoEndereco;

    @Column(name = "dat_atual_email")
    @JsonIgnore
    private Date dataAtualizacaoEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = new Date(dataNascimento.getTime());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Long getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(Long numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Date getDataAtualizacaoEmail() {
        return dataAtualizacaoEmail;
    }

    public void setDataAtualizacaoEmail(Date dataAtualizacaoEmail) {
        this.dataAtualizacaoEmail = new Date(dataAtualizacaoEmail.getTime());
    }

    @Override
    public String toString() {
        return "Cliente [id="
                + id
                + ", dataNascimento="
                + dataNascimento
                + ", email="
                + email
                + ", nomeCliente="
                + nomeCliente
                + ", numeroCpf="
                + numeroCpf
                + ", tipoEndereco="
                + tipoEndereco
                + ", dataAtualizacaoEmail="
                + dataAtualizacaoEmail
                + "]";
    }
}
