package com.entity;

import com.entity.Blog;
import com.entity.Reader;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-12T15:18:59")
@StaticMetamodel(BlogReader.class)
public class BlogReader_ { 

    public static volatile SingularAttribute<BlogReader, Blog> idBlog;
    public static volatile SingularAttribute<BlogReader, Reader> idReader;
    public static volatile SingularAttribute<BlogReader, Integer> id;

}