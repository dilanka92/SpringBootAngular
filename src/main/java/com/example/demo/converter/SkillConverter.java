package com.example.demo.converter;

import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Skill;


class SkillConverter {
    static Skill dtoToEntity(SkillDto SkillDto) {
        Skill Skill = new Skill(SkillDto.getSkillName(), null);
        Skill.setSkillId(SkillDto.getSkillId());
        return Skill;
    }

    static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }
}
