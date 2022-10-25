package Model;

import financial.exception.ModelException;

public class Article extends Common{

    private String title;

    public Article(){}

    public Article (String title) throws ModelException {
        if ((title.length() ==0)) throw new ModelException(ModelException.TITLE_EMPTY);
        this.title = title;

    }

}
