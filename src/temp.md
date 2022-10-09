

查询配置的分类模板关联

```
SELECT
	id,
	field_template_id,
	archive_menu_name,
	archive_menu_order,
	field_id,
	name,
	field_type,
	restrictions,
	is_required,
	field_order,
	engineer_read,
	engineer_write,
	admin_read,
	admin_write,
	create_user_id,
	create_datetime,
	modify_user_id,
	modify_datetime,
	deleted
FROM
	field_template_config
WHERE
	deleted = 0
	AND (field_template_id = 1386643587090923521
		AND archive_menu_name = '设备效率')
ORDER BY
	field_order ASC

```





所有值的查询

```

-- 91 -- ==>  
 select
	id,
	field_template_id,
	field_id,
	name,
	field_type,
	restrictions,
	create_user_id,
	create_datetime,
	modify_user_id,
	modify_datetime,
	deleted
from
	field_template_form
where
	deleted = 0
	and (field_template_id = 1386643587090923521
		and field_id = 1386650311088717826)

```





表格形字段查询

```

-- 91 -- ==>  
 select
	id,
	field_template_id,
	field_id,
	name,
	field_type,
	restrictions,
	create_user_id,
	create_datetime,
	modify_user_id,
	modify_datetime,
	deleted
from
	field_template_form
where
	deleted = 0
	and (field_template_id = 1386643587090923521
		and field_id = 1386650311088717826)

```



表格型字段值查询

```

-- 92 -- ==>  
 select
	ffc.ID,
	ffc.FIELD_TEMPLATE_ID,
	ffc.DELETED,
	ffc.FIELD_ID,
	ffc.FIELD_TYPE,
	ffc.DEVICE_ID,
	ffc.STRING_VALUE,
	ffc.DECIMAL_VALUE,
	ffc.DATE_VALUE,
	ffc.ENUM_VALUE,
	ffc.CODE,
	ffc.NAME,
	ffc.LINE,
	ftf.RESTRICTIONS
from
	`field_form_value` ffc
left join field_template_form ftf on
	(ffc.FIELD_TEMPLATE_ID = ftf.FIELD_TEMPLATE_ID
		and ffc.FIELD
		_ID = ftf.FIELD_ID
		and ffc.`CODE` = ftf.`CODE`)
where
	ffc.FIELD_TEMPLATE_ID = 1386643587090923521
	and ffc.DEVICE_ID = 1549590022197469185
	and ffc.FIELD_ID = 1386650311088717826;

```

