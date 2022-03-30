package com.example.testlogflase.controller;
import com.fhl.logtestspringbootstarter.config.logSession;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class logSessioniml implements logSession  {
    public String User;
    public String dbName;

    @Override
    public String getUser() {
        return User;
    }
    public void setUser(String User){
        this.User=User;
    }
    @Override
    public String getDbName() {
        return dbName;
    }
    public void setDbname(String dbName){
        this.dbName=dbName;
    }
    public static class logSessionBuilder{
        public String _User;
        public String _dbName;
        public logSessionBuilder User(String User){
            this._User=User;
            return this;
        }
        public logSessionBuilder dbName(String dbName){
            this._dbName=dbName;
            return this;
        }
        public logSessioniml builder(){
            logSessioniml logSessioniml =new logSessioniml();
            logSessioniml.setDbname(_dbName);
            logSessioniml.setUser(_User);
            return logSessioniml;
        }
    }
}
