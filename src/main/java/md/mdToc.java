package md;

import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;

public class mdToc {
    public static void main(String[] args) {
        String path = "D:\\idea_project\\javaTutorial\\docs\\database";
        AtxMarkdownToc.newInstance().genTocDir(path);
    }
}
