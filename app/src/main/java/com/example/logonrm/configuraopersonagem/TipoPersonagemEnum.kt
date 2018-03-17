package com.example.logonrm.configuraopersonagem

/**
 * Created by logonrm on 16/03/2018.
 */
enum class  TipoPersonagemEnum (val id: Int) {
    FUNKEIRO (0),
    PUNK (1),
    GRUNGE (2),
    PAGODEIRO (3),
    RAPPER (4);

    companion object {
        fun from(findValue: Int) : TipoPersonagemEnum =
                TipoPersonagemEnum.values() .first { it.id == findValue }

    }
}